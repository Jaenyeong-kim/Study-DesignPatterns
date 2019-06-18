package com.jaenyeong.iterator.refactor1;

import com.jaenyeong.iterator.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem item = items.get(position);
		position += 1;
		return item;
	}
}
