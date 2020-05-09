package com.example.startmemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MemoListViewModel(
    private val getMemoList: GetMemoListUseCase
) {
    private val _memoList = MutableLiveData<List<Memo>>()
    val memoList: LiveData<List<Memo>>
        get() = _memoList
}