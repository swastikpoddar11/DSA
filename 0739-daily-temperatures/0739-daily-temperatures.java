class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int count = 0;
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i = 0 ; i<n ; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevind = stack.pop();
                ans[prevind] = i - prevind;
            }
            stack.push(i);

        }
        return ans ;
    }
}