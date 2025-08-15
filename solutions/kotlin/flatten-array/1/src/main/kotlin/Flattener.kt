object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val result = mutableListOf<Any>()

        fun process(item: Any?) {
            when (item) {
                null -> {} // bỏ qua
                is Collection<*> -> item.forEach { process(it) } // xử lý tiếp nếu là collection
                else -> result.add(item) // giá trị hợp lệ
            }
        }

        source.forEach { process(it) }
        return result
    }
}
