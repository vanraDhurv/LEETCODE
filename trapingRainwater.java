class trapingRainwater{
    public static int trap(int[] height) {
        int storeWater = 0;
        int leftMost[] = new int[height.length];
        leftMost[0] = height[0];
        for(int i =1;i<height.length;i++){
            leftMost[i] = Math.max(height[i], leftMost[i-1]);
        }
        int rightMost[] = new int[height.length];
        rightMost[height.length-1] = height[height.length-1];
        for(int i =height.length-2;i>=0;i--){
            rightMost[i] = Math.max(height[i], rightMost[i+1]);
        }

        for(int i = 0; i<height.length;i++){
            int minhight = Math.min(leftMost[i],rightMost[i]);
            storeWater = storeWater+(minhight - height[i]); 
        }
        return storeWater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trap1 = trap(height);
        System.out.println(trap1);  
    }
}