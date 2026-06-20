class Twitter {

    private static int timeStamp = 0;

    private class Tweet {
        int id;
        int time;
        Tweet next;

        Tweet(int id) {
            this.id = id;
            this.time = timeStamp++;
            this.next = null;
        }
    }

    private class User {
        int id;
        Set<Integer> followees;
        Tweet head;

        User(int id) {
            this.id = id;
            this.followees = new HashSet<>();
            follow(id);
            this.head = null;
        }

        void follow(int  userId) {
            followees.add(userId);
        }

        void unfollow(int userId) {
            if(userId != this.id) {
                followees.remove(userId);
            }
        }

        void post(int tweetId) {
            Tweet newTweet = new Tweet(tweetId);
            newTweet.next = head;
            head = newTweet;

        }
    }
    private Map<Integer,User> userMap;

    public Twitter() {
        userMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if(!userMap.containsKey(userId)){
            userMap.put(userId, new User(userId));
        }
        userMap.get(userId).post(tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if(!userMap.containsKey(userId)) return res;

        Set<Integer> followees = userMap.get(userId).followees;
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a,b) ->b.time - a.time);

        for (int followeeId: followees) {
            Tweet tweet = userMap.get(followeeId).head;
            if(tweet!= null) {
                maxHeap.offer(tweet);
            }
        }
        while (!maxHeap.isEmpty() && res.size() < 10) {
            Tweet tweet = maxHeap.poll();
            res.add(tweet.id);
            if(tweet.next != null) {
                maxHeap.offer(tweet.next);
            }
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
       if(!userMap.containsKey(followerId)) {
           userMap.put(followerId,new User(followerId));
       }
       if(!userMap.containsKey(followeeId)) {
           userMap.put(followeeId,new User(followeeId));
       }
       userMap.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(userMap.containsKey(followerId)) {
            userMap.get(followerId).unfollow(followeeId);
        }
    }

}
