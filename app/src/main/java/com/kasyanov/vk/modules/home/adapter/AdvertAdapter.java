package com.kasyanov.vk.modules.home.adapter;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kasyanov.vk.R;
import com.kasyanov.vk.databinding.ItemAdvertLayoutBinding;
import com.kasyanov.vk.databinding.LayoutLoadingItemBinding;
import com.kasyanov.vk.mvp.model.AdvertVO;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdvertAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;

    private LayoutInflater mLayoutInflater;
    private List<AdvertVO> mAdvertList = new ArrayList<>();

    @BindingAdapter("bind:imageUrl")
    public static void loadImage(ImageView imageView, String imageUrl) {
        Picasso.with(imageView.getContext()).load(imageUrl).fit().centerCrop().into(imageView);
    }

    public AdvertAdapter(LayoutInflater inflater) {
        mLayoutInflater = inflater;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM) {
            View view = mLayoutInflater.inflate(R.layout.item_advert_layout, parent, false);
            return new AdvertViewHolder(view);
        } else if (viewType == VIEW_TYPE_LOADING) {
            View view = mLayoutInflater.inflate(R.layout.layout_loading_item, parent, false);
            return new LoadingViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof AdvertViewHolder) {
            ((AdvertViewHolder) holder).bind(mAdvertList.get(position));
        } else if (holder instanceof LoadingViewHolder) {
            ((LoadingViewHolder) holder).binding.progressBar.setIndeterminate(true);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return mAdvertList.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return mAdvertList.size();
    }

    public void addAdverts(List<AdvertVO> adverts) {
        removeProgressBar();
        final int curSize = getItemCount();
        mAdvertList.addAll(adverts);
        notifyItemRangeInserted(curSize, getItemCount() - 1);
        addProgressBar();
    }

    public void addProgressBar() {
        mAdvertList.add(null);
        notifyItemInserted(mAdvertList.size() - 1);
    }

    public void removeProgressBar() {
        if (mAdvertList.size() != 0) {
            mAdvertList.remove(mAdvertList.size() - 1);
            notifyItemRemoved(mAdvertList.size());
        }
    }

    static class AdvertViewHolder extends RecyclerView.ViewHolder {
        ItemAdvertLayoutBinding binding;

        public AdvertViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }

        public void bind(AdvertVO advert) {
            binding.setAdvert(advert);
        }
    }

    static class LoadingViewHolder extends RecyclerView.ViewHolder {
        public LayoutLoadingItemBinding binding;

        public LoadingViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
