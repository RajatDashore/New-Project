package com.uoons.india.ui.home.fragment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.uoons.india.R
import com.uoons.india.databinding.RowHomeDealOfTheDayBinding
import com.uoons.india.ui.base.BaseRecyclerAdapter
import com.uoons.india.ui.home.fragment.model.DeshBoardItems
import com.uoons.india.utils.CommonUtils

class DealOfTheDayItemRecyclerAdapter: BaseRecyclerAdapter<RowHomeDealOfTheDayBinding, Any, DealOfTheDayItemRecyclerAdapter.ViewHolder>(){
    private var customProductIdClickListener: OnProductIdClickListener? = null
    var bestSellerItemList: ArrayList<DeshBoardItems>? = null
    lateinit var context: Context

    interface OnProductIdClickListener {
        fun onProductIdClicked(pId: String)
    }

    fun setOnItemClickListener(mItemClick: OnProductIdClickListener) {
        this.customProductIdClickListener = mItemClick
    }

    fun setData(data:  ArrayList<DeshBoardItems>, context: Context){
        this.bestSellerItemList = data
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int, type: Int) {
        holder.bind(bestSellerItemList!![position])

        holder.binding.ivItemsImage.setOnClickListener(View.OnClickListener {
            customProductIdClickListener?.onProductIdClicked(bestSellerItemList!![position].pid.toString())
        })
    }

    override fun onCreateViewHolder(viewDataBinding: RowHomeDealOfTheDayBinding, parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RowHomeDealOfTheDayBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getLayoutId(viewType: Int): Int {
        return R.layout.row_home_deal_of_the_day
    }

    override fun getItemCount(): Int {
        return bestSellerItemList!!.size
    }

    class ViewHolder(val binding: RowHomeDealOfTheDayBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: DeshBoardItems){
            binding.homeBestSeller = data
            binding.executePendingBindings()
        }
    }

   /* companion object {
        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(thubmImage: ImageView, url: String) {
            if (url.isEmpty()){
                CommonUtils.loadImage(thubmImage, "", thubmImage.id)
            }else {
                CommonUtils.loadImage(thubmImage, url, thubmImage.id)
            }
        }
    }
why is this commented out?showing waring cause it is overriding
    */
}