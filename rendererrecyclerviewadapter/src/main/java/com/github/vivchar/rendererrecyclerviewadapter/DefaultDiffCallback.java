package com.github.vivchar.rendererrecyclerviewadapter;

import android.support.annotation.NonNull;

/**
 * Created by Vivchar Vitaly on 20.10.17.
 */

public class DefaultDiffCallback <BM extends ItemModel> extends DiffCallback<BM> {

	@Override
	public boolean areItemsTheSame(@NonNull final BM oldItem, @NonNull final BM newItem) {
		return areContentsTheSame(oldItem, newItem);
	}

	@Override
	public boolean areContentsTheSame(@NonNull final BM oldItem, @NonNull final BM newItem) {
		return oldItem.equals(newItem);
	}
}