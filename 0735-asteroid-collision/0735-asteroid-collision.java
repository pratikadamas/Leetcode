class Solution {
    public int[] asteroidCollision(int[] arr) {
           Stack<Integer> st = new Stack<>();

    for (int a : arr) {
        boolean alive = true;

        while (alive && a < 0 && !st.isEmpty() && st.peek() > 0) {

            if (st.peek() < -a) {
                st.pop();
            }
            else if (st.peek() == -a) {
                st.pop();
                alive = false;
            }
            else {
                alive = false;
            }
        }

        if (alive) {
            st.push(a);
        }
    }

    return st.stream().mapToInt(Integer::intValue).toArray();
    }
}