package StackAndQueues

class QueueByTwoLinkedList {
    class Node(var data: Int) {
        var next: Node? = null
        var prev: Node? = null
    }
    class Queue {
        private var head: Node? = null
        private var tail: Node? = null
        fun empty(): Boolean {
            return head == null
        }

        fun print() {
            var queue: Node? = head
            while (queue != null) {
                print(queue.data)
                print(" ")
                queue = queue.next
            }
        }

        fun Enqueue(data: Int) {
            val queue = Node(data)
            if (empty()) {
                tail = queue
            } else {
                head?.prev = queue
            }
            queue.next = head
            head = queue
        }

        fun Dequeue() {
            val queue: Node? = tail
            if (head == null) {
                println("This is impossible")
                return
            } else if (head!!.next == null) head = null else tail?.prev?.next = null
            tail = tail?.prev
        }

        fun size(): Int {
            var size = 0
            if (head != null) {
                var temp: Node? = head
                while (temp != null) {
                    size++
                    temp = temp.next
                }
            }
            println(size)
            return size
        }

        fun free() {
            if (empty()) {
                println("This is impossible")
            }
            while (head != null) {
                Dequeue()
            }
        }
    }

}
