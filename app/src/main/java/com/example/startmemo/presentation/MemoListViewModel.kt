package com.example.startmemo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.startmemo.domain.GetMemoListUseCase
import com.example.startmemo.domain.Memo

class MemoListViewModel(
    private val getMemoList: GetMemoListUseCase
) {
    private val _memoList = MutableLiveData<List<Memo>>()
    val memoList: LiveData<List<Memo>>
        get() = _memoList
}