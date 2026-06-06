//container-with-most-water

class Solution {
  public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int maxiArea = 0;

        while (left < right) {
            int width = right - left;
            int h = min(height[left], height[right]);

            maxiArea = max(maxiArea, width * h);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxiArea;
    }
};
