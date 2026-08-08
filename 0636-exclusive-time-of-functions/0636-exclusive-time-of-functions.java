class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        int prev = 0;
        for(String log:logs){
            String[] curr = log.split(":");
            int id = Integer.parseInt(curr[0]);
            String type = curr[1];
            int time = Integer.parseInt(curr[2]);

            if(type.equals("start")){
                if(!stack.isEmpty()){
                    ans[stack.peek()] += time-prev;
                }
                stack.push(id);
                prev = time;
            }
            else{
                ans[stack.pop()] += time-prev+1;
                prev = time+1;
            }
        }
        return ans;
    }
}