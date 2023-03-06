package StackAndQueues

class QueueByLinkedList {
    class Node(var data: Int) {
        var next: Node? = null
    }
    class Queue {
        private var head: Node? = null
        private var tail: Node? = null

        fun isEmpty(): Boolean {
            return head == null
        }

        fun print() {
            var queue = head
            while (queue != null) {
                print(queue.data)
                print(" ")
                queue = queue.next
            }
            println()
        }

        fun Enqueue(data: Int) {
            val queue = Node(data)
            if (isEmpty()) {
                head = queue
            } else {
                tail!!.next = queue
            }
            tail = queue
        }

        fun Dequeue() {
            if (head == null) {
                println("This is impossible")
                return
            }
            val queue: Node = head as Node
            head = head!!.next
        }

        fun size(): Int {
            var size = 0
            if (head != null) {
                var temp = head
                while (temp != null) {
                    size++
                    temp = temp.next
                }
            }
            println(size)
            return size
        }

        fun free() {
            if (isEmpty()) {
                println("This is impossible")
            }
            while (head != null) {
                Dequeue()
            }
        }
    }
}