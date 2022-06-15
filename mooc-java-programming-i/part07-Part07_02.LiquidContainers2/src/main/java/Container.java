public class Container {

    private int container;

    public Container() {

    }

    public int contains() {
        return container;
    }

    public void add(int amount) {
        if (amount > 0) {
            container = container + amount;
        }

        if (container >= 100) {
            container = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            container = container - amount;
        }

        if (container < 0) {
            container = 0;
        }
    }

    public String toString() {
        return container + "/100";
    }

}

class Solution {
    public int maxArea(int[] H) {
        int ans = 0, i = 0, j = H.length - 1, res = 0;
        while (i < j) {
            if (H[i] <= H[j]) {
                res = H[i] * (j - i);
                i++;
            } else {
                res = H[j] * (j - i);
                j--;
            }
            if (res > ans)
                ans = res;
        }
        return ans;
    }
}
