class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var type = ArrayList<String>()
        var color = ArrayList<String>()
        var name = ArrayList<String>()

        for (i in items.indices) {
            for (j in items.indices) {
                when (j) {
                    0 -> {
                        type.add(items[i][j])
                    }

                    1 -> {
                        color.add(items[i][j])
                    }

                    2 -> {
                        name.add(items[i][j])
                    }
                }
            }
        }
        println("--------------")
        println(type)
        println(color)
        println(name)
        println("--------------")
        return 0
    }
}