package com.kt.demos.mvvm.view.postresponse

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kt.demos.databinding.RowItemPostBinding
import com.kt.demos.mvvm.model.Post

class PostAdapter(private var postList : List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class PostViewHolder(itemPostRow : RowItemPostBinding) : RecyclerView.ViewHolder(itemPostRow.root){

    }

}