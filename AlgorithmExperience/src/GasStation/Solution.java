package GasStation;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.run();

	}

	private void run() {
		int gas[] = { 1, 2, 3, 4, 5 };
		int cost[] = { 1, 1, 1, 6, 1 };
		int ret = canCompleteCircuit(gas, cost);
		System.out.println(ret);
	}

	public int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas == null || cost == null || gas.length != cost.length) {
			return -1;
		}
		if (gas.length == 0 || cost.length == 0) {
			return -1;
		}
		int[] diffList = new int[gas.length];
		int totalSpend = 0;
		for (int i = 0; i < gas.length; i++) {
			diffList[i] = gas[i] - cost[i];
			totalSpend += diffList[i];
		}
		if (totalSpend < 0) {
			return -1;
		}
		int ret = diffList[0];
		int index = 0;
		for (int i = 0; i < gas.length; i++) {
			if (ret < 0) {
				index = i;
				ret = diffList[i];
			} else {
				ret += diffList[i];
			}
		}
		return index;
	}
}
