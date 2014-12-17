package org.algorithm.course.unionfind;

public class UFQuickFind extends UnionFind {
	
	private int[] array;
	
	public UFQuickFind(int n) {
		array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
	}

	@Override
	public boolean isConnected(int p, int q) {
		return array[p] == array[q];
	}

	@Override
	public void union(int p, int q) {
		int pid = array[p];
		int qid = array[q];
		
		if(!isConnected(p, q)) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == pid) array[i] = qid;
			}
		}
	}

}
