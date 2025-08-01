class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // First row is always [1]
        if (numRows >= 1) {
            triangle.add(new ArrayList<>());
            triangle.get(0).add(1);
        }

        // Build each row from the second row to the nth row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                // Sum of two elements from the previous row
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            newRow.add(1); // Last element is always 1
            triangle.add(newRow);
        }

        return triangle;
    }
}
