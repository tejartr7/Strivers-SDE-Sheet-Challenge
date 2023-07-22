TreeNode<int> *flattenBinaryTree(TreeNode<int> *root)

{

    // Write your code here.

    TreeNode<int>* curr = root;

    while(curr!=NULL)

    {

        if(curr->left)

        {

            TreeNode<int>* pre = curr->left;

            while(pre->right)

            {

                pre = pre->right;

            }

 

            pre->right = curr->right;

            curr->right = curr->left;

            curr->left = NULL;

        }

        curr = curr->right;

    }

    return root;

}
