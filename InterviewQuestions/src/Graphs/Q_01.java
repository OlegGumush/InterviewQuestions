package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Q_01 {

	public static void main(String[] args) {
		ArrayList<Integer>[] a = new ArrayList[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new ArrayList<>();
		}
		a[0].add(1);

		a[1].add(2);
		a[1].add(4);
		a[1].add(0);

		a[2].add(1);
		a[2].add(3);

		a[3].add(2);
		a[4].add(1);

		BFS(a, 0);
	}

	public static void BFS(ArrayList<Integer>[] a, int start) {
		Color color[] = new Color[a.length];
		int dis[] = new int[a.length];
		int parent[] = new int[a.length];

		for (int i = 0; i < color.length; i++) {
			color[i] = Color.White;
			dis[i] = 0;
			parent[i] = -1;
		}

		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(a.length);
		q.add(start);
		color[start] = Color.Grey;

		while (!q.isEmpty()) {
			int v = q.poll();

			for (int n : a[v]) {
				if (color[n] == Color.White) {
					color[n] = Color.Grey;
					parent[n] = v;
					dis[n] = dis[v] + 1;
					q.add(n);
				}
			}
			color[v] = Color.Black;
		}
		
		System.out.println("color: "+Arrays.toString(color));
		System.out.println("parent: "+Arrays.toString(parent));
		System.out.println("distance: " +Arrays.toString(dis));
	}
}
