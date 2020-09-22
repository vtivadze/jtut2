class PascalTriangle {
	public static void main(String[] args) {
		int n = 10, arr[][] = new int[n][];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int k = 0; k < arr[i].length; k++) {
				if (i == 0 || i == 1) {
					arr[i][k] = 1;
				} else {
					if (k == 0 || k == arr[i].length - 1) {
						arr[i][k] = 1;
					} else {
						arr[i][k] = arr[i - 1][k - 1] + arr[i - 1][k];
					}
				}
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}
	}
}