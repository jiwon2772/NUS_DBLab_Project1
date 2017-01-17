package myPackage;

import java.util.ArrayList;

public class Relationship extends Node {

	ArrayList<Node> lists = new ArrayList<Node>();// attribute ���� ��
	ArrayList<Boolean> isMulti_Lists = new ArrayList<Boolean>();
	// relationship�� ���õ� entity�� multi ���� �ƴ��� �Ǵ�

	public Relationship(String name) {
		this.name = name;
		this.isTemporal = false;

	}

	public void addList(int n, Node node) {
		lists.add(n, node);
	}

	public void addList_Multi(int n, Boolean node) {
		isMulti_Lists.add(n, node);
	}

	public ArrayList<Node> getArrayList() {
		return this.lists;
	}

	public ArrayList<Boolean> getArrayListMulti() {
		return this.isMulti_Lists;
	}
}
