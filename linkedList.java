import java.util.*;
public class linkedList 
{
  static class Node 
  {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next=null;
    }
  } 
  Node head = null;
  Scanner sc =new Scanner(System.in);
  public void begin()
  {
    System.out.print("Enter data ");
    int data = sc.nextInt();
    Node new_node = new Node(data);
    if(head == null)
    {
      head = new_node;
    }
    else 
    {
        Node temp = head;
        head = new_node;
        new_node.next =temp;
    }
  }
  public void between()
  {
    System.out.print("Enter data ");
    int data = sc.nextInt();
    Node new_node = new Node(data);
    System.out.print("Enter position ");
    int pos = sc.nextInt();
    if(head == null)
    {
      head = new_node;
    } 
    else 
    {
       Node temp = head;
       for(int i=1;i<pos-1;i++)
       {
         temp = temp.next;
       }
       new_node.next = temp.next;
       temp.next= new_node;
    }

  }
  public void end()
  {
    System.out.print("Enter data ");
    int data = sc.nextInt();
    Node new_node = new Node(data);
    if(head == null)
    {
      head = new_node;
    } 
    else 
    {
        Node temp = head;
        while(temp.next!= null)
        {
            temp= temp.next;
        }
        temp.next = new_node;
    }

  }
  public void traverse()
  {
    Node temp =head;
    if(head == null)
    {
        System.out.println("LL is empty ");
    } 
    else 
    {
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    System.out.println();
  }
  public void dltbeg()
  {
    if(head == null)
    {
        System.out.println("LL is empty ");
    } 
    else 
    {
       Node temp =head;
       head = temp.next;
    }
  }
  public void dltend()
  {
    if(head == null)
    {
        System.out.println("LL is empty ");
    } 
    else 
    {
        Node temp = head ;
        Node ptr = temp.next;
        while(ptr.next!=null)
        {
            temp = temp.next;
            ptr=ptr.next;
        }
        temp.next = null;
    }
  }
  public void dltbtw()
  {
    System.out.print("Enter position ");
    int pos = sc.nextInt(); 
    if(head == null)
    {
        System.out.println("LL is empty ");
    } 
    else 
    {
        Node temp = head ;
        Node ptr = temp.next;
        for(int i=1;i<pos-1;i++)
        {
             temp = temp.next;
             ptr=ptr.next;
        } 
        temp.next = ptr.next;

    }

  }
  public void sorting()
  {
    int c=0;
    if(head != null)
      {
        Node temp = head;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
      }   
        
        for(int i=0;i<c;i++)
        {
            int d;
            Node temp1 = head;
            Node ptr = temp1 .next;
            for(int j=0;j<c-i-1;j++)
            {
               
                if(temp1.data>ptr.data)
                {
                   d= temp1.data;
                   temp1.data =ptr.data;
                   ptr.data = d;
                }
                temp1 =temp1.next;
                ptr=ptr.next;
            }
        }
        Node temp2 =head;
        while(temp2 != null)
        {
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
  
    }
    
    public static void main(String[] args)
    {
        linkedList ll = new linkedList();
        Scanner sc =new Scanner(System.in);
        int data,m=0,n;
        do 
        {
            System.out.println("Press 1 push the data at beginning \nPress 2 to push the data in between\nPress 3 to push the data the ending \nPress 4 to display the data \nPress 5 to delete the data from ending \nPress 6 to delete the data in between \nPress 7 to delete the data from ending \nPress 8 to sort the data ");
            System.out.print("Enter Choice: ");
            n =sc.nextInt();
            switch(n)
            {
                case 1:
                ll.begin();
                break;
                case 2:
                ll.between();
                break;
                case 3:
                ll.end();
                break;
                case 4:
                ll.traverse();
                break;
                case 5:
                ll.dltbeg();
                break;
                case 6:
                ll.dltbtw();
                break;
                case 7:
                ll.dltend();
                break;
                case 8:
                ll.sorting();
                break;
                default: System.out.println("Enter correct choice ");
                break;
            }
            System.out.print("Press 1 to go the menu ");
            m =sc.nextInt();
        }while(m==1);
    }
}


