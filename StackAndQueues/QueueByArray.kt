package StackAndQueues

class QueueByArray {
    class QueueArray {
        inner class Queue {
            var num = 10
            var mas = IntArray(num)
            var alpha = 0
        }

        var queue: Queue = Queue()
        fun Enqueue(value: Int) {
            if (queue.alpha == queue.num) resize()
            queue.mas[queue.alpha] = value
            queue.alpha += 1
        }

        fun Dequeue() {
            queue.num--
            val mas2 = IntArray(queue.num)
            for (i in 0 until queue.num) mas2[i] = queue.mas[i + 1]
            queue.mas = mas2
            queue.alpha -= 1
        }

        fun ShowFront() {
            println(queue.mas[0])
        }

        fun ShowLast() {
            println(queue.mas[queue.alpha - 1])
        }

        fun size() {
            println(queue.num)
        }

        fun show() {
            for (i in 0 until queue.num) print(queue.mas[i].toString() + " ")
            println()
        }

        fun resize() {
            val mas2 = IntArray(queue.num + 2 * queue.num / 3)
            for (i in 0 until queue.num) mas2[i] = queue.mas[i]
            queue.mas = mas2
            queue.num = queue.num + 2 * queue.num / 3
        }
    }
}