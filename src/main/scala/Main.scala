import org.scalajs.dom
import org.scalajs.dom.document

object Main extends App {
  println("Hello, World!") // In console

  appendPar(document.body, "Hello World") // In dom

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }
}
