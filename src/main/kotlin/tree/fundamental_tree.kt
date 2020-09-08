package tree
fun main() {
    val t = Tree()
    val n4 = t.createNode(null, 4, null)
    val n5 = t.createNode(null, 5, null)
    val n2 = t.createNode(n4, 2, n5)
    val n3 = t.createNode(null, 3, null)
    val n1 = t.createNode(n2, 1, n3)

    t.root = n1
    t.inOrder(t.root)
    t.preOrder(t.root)
    t.postOrder(t.root)
}

class Node {
    var data:Int? = null
    var left: Node? = null
    var right: Node? = null
}

class Tree {
    var root: Node? = null
    fun createNode(_left: Node?, _data:Int, _right: Node?): Node {
        return Node().apply {
            data = _data
            left = _left
            right = _right
        }
    }

    fun inOrder(node: Node?){
        node?.let {
            inOrder(it.left)
            println("current node data in Order: ${it.data}")
            inOrder(it.right)
        }
    }

    fun preOrder(node: Node?){
        node?.let {
            println("current node data in preOrder: ${it.data}")
            preOrder(node.left)
            preOrder(node.right)
        }
    }

    fun postOrder(node: Node?){
        node?.let {
            postOrder(node.left)
            postOrder(node.right)
            println("current node data in postOrder: ${it.data}")
        }
    }
}