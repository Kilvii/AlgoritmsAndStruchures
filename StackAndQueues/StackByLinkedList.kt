package StackAndQueues

class StackByLinkedList {
    class Node(var data: Int) {
        var next: Node? = null
    }

    public class Stack {
        private var head: Node? = null
        private val last: Node? = null

        fun IsEmpty(): Boolean {
            return head == null
        }

        fun push(data: Int) {
            val stack = Node(data)
            stack.next = head
            head = stack
        }


        fun peek(): Int {
            if (head == null) {
                println("This is impossible")
                return -1
            }
            println(head!!.data)
            return head!!.data
        }

        fun pop() {
            if (head == null) {
                println("This is impossible")
                return
            }
            val stack: Node = head as Node
            head = head!!.next
        }


        fun print() {
            var stack = head
            while (stack != null) {
                print(stack.data)
                print(" ")
                stack = stack.next
            }
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
            if (head == null) {
                println("This is impossible")
            }
            while (head != null) {
                pop()
            }
        }
    }
}