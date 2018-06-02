package Graphs;

import java.util.ArrayList;

public class Q_02 {

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

		DFS(a);
	}

	public static void DFS(ArrayList<Integer>[] g) {
		Color color[] = new Color[g.length];
		int parent[] = new int[g.length];

		for (int i = 0; i < color.length; i++) {
			color[i] = Color.White;
			parent[i] = -1;
		}

		for (int i = 0; i < g.length; i++) {
			if (color[i] == Color.White) {
				DFS(i, color, parent, g);
			}
		}
	}

	private static void DFS(int v, Color[] color, int parent[], ArrayList<Integer>[] g) {
		color[v] = Color.Grey;

		for (int ng : g[v]) {
			if (color[ng] == Color.White) {
				parent[ng] = v;
				DFS(ng, color, parent, g);
			}
		}

		color[v] = Color.Black;
	}

}
