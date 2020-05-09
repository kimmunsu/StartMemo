package com.example.startmemo.data

import com.example.startmemo.domain.Memo
import com.example.startmemo.domain.MemoRepository
import java.util.concurrent.atomic.AtomicLong

class MapMemoRepository : MemoRepository {

    companion object {
        const val MEMBER_ID_INIT_VALUE = 1L
    }

    private val map = mutableMapOf<Long, Memo>()
    private val key = AtomicLong(MEMBER_ID_INIT_VALUE)

    override fun getMemoList(): List<Memo> {
        return map.values.toList()
    }

    override fun insertMemo(memo: Memo) : Memo {
        val copyMemo = memo.copy(id = key.getAndIncrement())
        map[copyMemo.id] = copyMemo
        return copyMemo
    }

    override fun deleteMemo(id: Long) {
        map.remove(id)
    }

    override fun updateMemo(memo: Memo) {
        map[memo.id] = memo
    }

}