public class bsTree {
	
	static Node root;
	
	public static void fill (int [] array)
	{
		Height height = new Height();
		String name = "node";
		for (int x = 0; x <= array.length-1; x++)
		{
			addNode(array[x]);
		}
		
		//inOrderTraversal(root);
		System.out.println ("the height of the tree is " + height(root) + " nodes");
		System.out.println ("balanced: " + isBalanced(root));
	}
	
	public static void addNode (int key)
	{
		Node newNode = new Node (key);
		
		if (root == null)
			root = newNode;
		else {
			Node focusNode = root;
			Node parent;
			while (true)
			{
				parent = focusNode; 
				if (key < focusNode.key)
				{
					focusNode = focusNode.leftChild;
					if (focusNode == null){
						parent.leftChild = newNode;
						return;
				}
			} 
			else{
				focusNode = focusNode.rightChild;
					if (focusNode == null){
						parent.rightChild = newNode;
						return;
						}
				}
			}
		}
	}
	static int max(int a, int b) 
	    {
	        return (a >= b) ? a : b;
	    }
	 
	 static int height(Node node) 
	    {
	        if (node == null)
	            return 0;
	        return 1 + max(height(node.leftChild), height(node.rightChild));
	    }
	 static boolean isBalanced(Node node) 
	    {
	        int lHeight;
	        int rHeight;
	 
	        if (node == null)
	            return true;
	  
	        lHeight = height(node.leftChild);
	        rHeight = height(node.rightChild);
	  
	        if (Math.abs(lHeight - rHeight) <= 1
	                && isBalanced(node.leftChild)
	                && isBalanced(node.rightChild)) 
	            return true;
	  
	        return false;
	    }

}

