package Lists

class LinkedList {
    class List {
        private var head: Node? = null
        private var last: Node? = null
        private var size = 0

        fun List() {
            head = null
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
                head = temp
            } else {
                temp.next = head
                head = temp
            }
            size++
        }

        fun addBot(data: Int) {
            val temp = Node(data)
            if (head == null && size == 0) {
                addTop(data)
            } else {
                last?.next = temp
                last = temp
            }
            size++
        }

        fun addInd(data: Int, index: Int) {
            var cur: Node? = head
            var ind = 0
            val temp = Node(data)
            temp.data = data
            if (index < 0 || index > size) {
                println("This is impossible")
                return
            } else if (index == 0) {
                addTop(data)
            } else if (index == size) {
                addBot(data)
            } else {
                while (ind < index - 1) {
                    if (cur != null) {
                        cur = cur.next
                    }
                    ind++
                }
                if (cur != null) {
                    temp.next = cur.next
                }
                if (cur != null) {
                    cur.next = temp
                }
                size++
            }
        }

        fun print() {
            var temp: Node? = head
            println("List: ")
            while (temp != null) {
                print(temp.data)
                print(" -> ")
                temp = temp.next
            }
            println("\nLenght: $size")
        }

        fun delete() {
            if (size <= 0) {
                println("This is impossible")
                return
            }
            head = head?.next
            size--
        }

        fun deleteKey(key: Int) {
            var temp: Node? = head
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
                    head = head?.next
                } else {
                    var temp: Node? = head
                    for (i in 0 until index - 1) {
                        if (temp != null) {
                            temp = temp.next
                        }
                    }
                    val temp2: Node? = temp?.next
                    if (temp != null) {
                        temp.next = temp.next?.next
                    }
                    if (index == size - 1) {
                        last = temp
                    }
                }
                size--
            }
        }


        fun find(key: Int): Int {
            var temp: Node? = head
            var mid = 0
            if (size <= 0) {
                println("This is impossible")
                return -1
            }
            while (temp != null) {
                if (temp.data === key) {
                    print("Position: ")
                    return mid
                } else {
                    temp = temp.next
                    mid++
                }
            }
            println("This is impossible")
            return -1
        }
    }
    class Node(var data: Int) {
        var next: Node? = null
    }
}