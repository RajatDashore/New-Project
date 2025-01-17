package com.uoons.india.ui.home.fragment.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.uoons.india.R
import com.uoons.india.databinding.RowHomeCategoryBinding
import com.uoons.india.ui.base.BaseRecyclerAdapter
import com.uoons.india.ui.home.fragment.model.DeshBoardItems
import com.uoons.india.utils.CommonUtils


class NewArrivalsItemRecyclerAdapter :
    BaseRecyclerAdapter<RowHomeCategoryBinding, Any, NewArrivalsItemRecyclerAdapter.ViewHolder>() {

    private var customProductIdClickListener: OnProductIdClickListener? = null
    private var categoryItemList: ArrayList<DeshBoardItems>? = null
    lateinit var context: Context

    interface OnProductIdClickListener {
        fun onProductIdClicked(pId: String)
    }

    fun setOnItemClickListener(mItemClick: OnProductIdClickListener) {
        this.customProductIdClickListener = mItemClick
    }

    fun setData(data: ArrayList<DeshBoardItems>, context: Context) {
        this.categoryItemList = data
        this.context = context
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int, type: Int) {
        holder.bind(categoryItemList!![position])

        holder.binding.ivItemsImage.setOnClickListener(View.OnClickListener {
            customProductIdClickListener?.onProductIdClicked(categoryItemList!![position].pid.toString())
        })
    }

    override fun onCreateViewHolder(
        viewDataBinding: RowHomeCategoryBinding,
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        return ViewHolder(
            RowHomeCategoryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getLayoutId(viewType: Int): Int {
        return R.layout.row_home_category
    }

    override fun getItemCount(): Int {
        return categoryItemList!!.size
    }

    class ViewHolder(val binding: RowHomeCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DeshBoardItems) {
            binding.recyclerDataItems = data
        }
    }
    /*
   @Suppress
    companion object {
        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(thubmImage: ImageView, url: String) {
            Log.d("BindingAdapters", "loadImage called with URL: $url")
            if (url.isEmpty()) {
                CommonUtils.loadImage(thubmImage, "", thubmImage.id)
            } else {
                CommonUtils.loadImage(thubmImage, url, thubmImage.id)
            }
        }
    }
     */
}