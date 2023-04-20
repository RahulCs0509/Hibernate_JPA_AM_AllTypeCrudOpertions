package ManyToMany_Uni_Direc.controller;
public class TargetTwoSum {
	public static int[] main(String[] args) {
		int []arr=new int[] {4,3,2,5,6,1};
		int target=6;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]==target-arr[i]) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
}
