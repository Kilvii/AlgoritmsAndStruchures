package Lists

class TwoLinkedList {
    class List {
        private var head: Node? = null
        private var last: Node? = null
        private var size = 0

        fun List() {
            head = null
            last = null
            size = 0
        }

        fun empty(): Boolean {
            return if (size == 0) true else {
                false
            }
        }

        fun addTop(data: Int) {
            val temp = Node(data)
            if (head == null) {
                last = temp
            } else {
                head!!.prev = temp
            }
            temp.next = head
            head = temp
            size++
        }

        fun addBot(data: Int) {
            val temp = Node(data)
            if (head == null) {
                head = temp
            } else {
                last!!.next = temp
            }
            temp.prev = last
            last = temp
            size++
        }

        fun addInd(data: Int, index: Int) {
            var cur = head
            var ind = 0
            if (index < 0 || index > size) {
                println("This is impossible")
                return
            } else if (index == 0) {
                addTop(data)
            } else if (index == size) {
                addBot(data)
            } else {
                while (cur != null && ind != index) {
                    cur = cur.next
                    ind++
                }
                val temp = Node(data)
                cur!!.prev?.next = temp
                temp.prev = cur.prev
                temp.next = cur
                size++
            }
        }

        fun print() {
            var temp = head
            println("List: ")
            while (temp != null) {
                print(temp.data)
                print(" -> ")
                temp = temp.next
            }
            println("\nLenght: $size")
        }

        fun delete() {
            val temp = head
            if (head == null) {
                println("This is impossible")
                return
            } else {
                if (head!!.next == null) {
                    last = null
                } else {
                    head!!.next?.prev = null
                }
                head = head!!.next
                size--
            }
        }


        fun deleteBot() {
            if (head == null) {
                println("This is impossible")
                return
            } else {
                if (head!!.next == null) {
                    head = null
                } else {
                    last!!.prev?.next = null
                }
                last = last!!.prev
                size--
            }
        }


        fun deleteKey(key: Int) {
            var temp = head
            var i = 0
            while (temp != null) {
                if (temp.data === key) {
                    deleteByInd(i)
                    i--
                }
                i++
                temp = temp.next
            }
        }

        fun deleteByInd(index: Int) {
            if (index < 0 || index >= size) {
                println("This is impossible")
                return
            } else {
                if (index == 0) {
                    delete()
                } else if (index == size - 1) {
                    deleteBot()
                } else {
                    var temp = head
                    for (i in 0 until index - 1) {
                        temp = temp!!.next
                    }
                    temp!!.next = temp.next?.next
                    size--
                }
            }
        }

        fun find(key: Int): Int {
            var temp = head
            var mid = 0
            if (size <= 0) {
                println("This is impossible")
                return -1
            }
            while (temp != null) {
                if (temp.data === key) {
                    print("Position: ")
                    return mid
                }
                temp = temp.next
                mid++
            }
            println("This is impossible")
            return -1
        }
    }
    class Node(var data: Int) {
        var next: Node? = null
        var prev: Node? = null

        fun Node(data: Int) {
            this.data = data
        }
    }
}