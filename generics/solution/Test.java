package generics.solution;

import java.util.List;
import java.util.stream.Stream;

abstract class NodeScaffold<THIS extends NodeScaffold<THIS>> {

	String msg ;
	
    private List<THIS> children;

    private THIS n;
    
    public Stream<THIS> children() {
        return children.stream();
    }

    public Stream<THIS> grandChildren() {
        return children.stream()
            .flatMap(child -> child.children());
    }
    
    public void addChild(THIS node){
    	children.add(node);
    }
    
    public void set(THIS node){
    	n = node;
    }
    public THIS get(){
    	return n;
    }

}

abstract class SpecialNodeScaffold<THIS extends SpecialNodeScaffold<THIS>>
        extends NodeScaffold<THIS> {
    // special methods
}

abstract class VerySpecialNodeScaffold<THIS extends VerySpecialNodeScaffold<THIS>>
        extends SpecialNodeScaffold<THIS> {
    // more special methods
}

class Node extends NodeScaffold<Node> {
	
	Node(String s){
		this.msg = s;
	}
}

class NodeB extends Node {

	NodeB(String s) {
		super(s);
	}
	
}

class SpecialNode
        extends SpecialNodeScaffold<SpecialNode> { }

class VerySpecialNode
        extends VerySpecialNodeScaffold<VerySpecialNode> { }

class Test1<T extends Test1<T>> {
	T node;
	void set(T t){
		this.node = t;
	}
}
class Test2 extends Test1<Test2> {
	
}

public class Test {
	public static void main(String[] args){
//		t1.set(new String("aaa"));

		Node a = new Node("123");
		Node a1 = new Node("456");
		NodeB b = new NodeB("1111");
//		SpecialNode b = new SpecialNode();
//		SpecialNode b1 = new SpecialNode();
//		VerySpecialNode c = new VerySpecialNode();
//		VerySpecialNode c1 = new VerySpecialNode();
		a.set(a1);
		b.set(b);

//		b.addChild(b1);
//		c.addChild(c1);
	}

}
