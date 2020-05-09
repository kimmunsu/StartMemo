package com.example.startmemo.domain

import com.example.startmemo.domain.Memo

interface MemoRepository {

    fun getMemoList(): List<Memo>
    fun insertMemo(memo: Memo) : Memo
    fun deleteMemo(id: Long)
    fun updateMemo(memo: Memo)
    
}