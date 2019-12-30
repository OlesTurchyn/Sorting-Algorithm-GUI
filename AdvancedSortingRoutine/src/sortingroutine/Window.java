//Name: Oles Turchyn
//Project: Advanced Sorting Routines 
//Date: November 2, 2019 

package sortingroutine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

import javax.swing.JTextArea;
import java.awt.Button;
import java.awt.Toolkit;


public class Window 
{

	public JFrame SortingWindow;
	public JTextField txtInput;
	public JTextArea txtDisplay;
	
	
	public int[] nums;

	//Launch the application
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Window window = new Window();
					window.SortingWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the application
	public Window() 
	{
		initialize();
	}

	//Configure and initialize the contents of the application frame
	private void initialize() 
	{
		
		//Configure window
		SortingWindow = new JFrame();
		SortingWindow.setIconImage(Toolkit.getDefaultToolkit().getImage
		("C:\\Users\\oleks\\Pictures\\Philosophy Website\\Moses-and-the-Ten-Commandments-GettyImages-171418029-5858376a3df78ce2c3b8f56d.jpg"));
		
		SortingWindow.setForeground(Color.BLACK);
		SortingWindow.setTitle("Advanced Sorting Routines");
		SortingWindow.getContentPane().setForeground(Color.BLACK);
		SortingWindow.getContentPane().setBackground(new Color(0, 0, 128));
		SortingWindow.setBounds(100, 100, 503, 451);
		SortingWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SortingWindow.getContentPane().setLayout(null);
		
		//Initialize the display area
		txtDisplay = new JTextArea();
		JTextArea txtDisplay = new JTextArea();
		txtDisplay.setEditable(false);
		txtDisplay.setBounds(20, 74, 230, 317);
	
		
		SortingWindow.getContentPane().add(txtDisplay);
		
		//Initialize the text input field
		txtInput = new JTextField();
		txtInput.setBounds(297, 96, 108, 20);
		SortingWindow.getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		
		//Label Configurations
		JLabel lblTurchynTechnologies = new JLabel("Turchyn Technologies");
		lblTurchynTechnologies.setForeground(Color.YELLOW);
		lblTurchynTechnologies.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblTurchynTechnologies.setBounds(187, 44, 135, 20);
		SortingWindow.getContentPane().add(lblTurchynTechnologies);
		
		JLabel lblAdvancedSortingRoutine = new JLabel("ADVANCED SORTING ROUTINES");
		lblAdvancedSortingRoutine.setForeground(Color.YELLOW);
		lblAdvancedSortingRoutine.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblAdvancedSortingRoutine.setBounds(134, 9, 254, 50);
		SortingWindow.getContentPane().add(lblAdvancedSortingRoutine);
		
		JLabel lblAmountOfNumbers = new JLabel("Amount Of Numbers You Wish to Sort");
		lblAmountOfNumbers.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblAmountOfNumbers.setForeground(Color.YELLOW);
		lblAmountOfNumbers.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmountOfNumbers.setBounds(247, 74, 230, 14);
		SortingWindow.getContentPane().add(lblAmountOfNumbers);
		
	
		//Display button configuration
		final JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) 
			{
				int Input;
				Input = Integer.parseInt(txtInput.getText());
				
				nums = new int [Input];
				
				for (int i = 0; i < Input; i++) 
				{
		            nums[i] = (int) (Math.random() * 1000);
		            
				}
		       
				//Display the unsorted list
				txtDisplay.append("The unsorted list is:" + "\n");
				
				 for (int i = 0; i < Input; i++) 
				 {
			            txtDisplay.append(nums[i] + "\n");
			        
				 }
				
			}
		     
		
		});
		btnDisplay.setBounds(297, 127, 108, 23);
		SortingWindow.getContentPane().add(btnDisplay);
		
		//SELECTION SORT CONFIGURATION
		JButton btnSelection = new JButton("Selection Sort");
		btnSelection.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
							
				 int smallest;
			        for (int i = 0; i < nums.length - 1; i++) 
			        {
			            smallest = i;
			            //see if there is a smaller number further in the numsay
			            for (int index = i + 1; index < nums.length; index++) {
			                if (nums[index] > nums[smallest]) {
			                    smallest = index;
			                }
			            }
			            swap(nums, i, smallest); //swap the smallest element into position
			        }
			        
			        //Display the selection sorted list
					txtDisplay.append("The selection sorted list is:" + "\n");
					
					 for (int i = 0; i < nums.length; i++) 
					 {
				            txtDisplay.append(nums[i] + "\n");
				       
					 }
			}

			private void swap(int numsay2[], int first, int second) 
			{
				int hold = numsay2[first];
		        numsay2[first] = numsay2[second];
		        numsay2[second] = hold;
			}
		     
		});
		btnSelection.setBounds(284, 169, 141, 23);
		SortingWindow.getContentPane().add(btnSelection);
		
		
		//BUBBLE SORT CONFIGURATION
		JButton btnBubble = new JButton("Bubble Sort");
		btnBubble.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
						
			
				//Loop to control number of passes
		        for (int pass = 1; pass < nums.length; pass++) 
		        {
		            //Loop to control number of comparisons for length of numsay - 1
		            for (int element = 0; element < nums.length - 1; element++) 
		            {
		                //compare side-by-side elements and swap them if
		                //first element is greater than second element
		                if (nums[element] < nums[element + 1]) 
		                {
		                    swap(nums, element, element + 1);  //call to swap method
		                }
		
		            }
		            
		        }
		        
		        //Display the selection sorted list
				txtDisplay.append("The bubble sorted list is:" + "\n");
				
				 for (int i = 0; i < nums.length; i++) 
				 {
			            txtDisplay.append(nums[i] + "\n");
				 }
		        
			}
		        
		
			 private void swap(int numsay2[], int first, int second) 
			 {
			        int hold = numsay2[first];
			        numsay2[first] = numsay2[second];
			        numsay2[second] = hold;
			    }
		});
		btnBubble.setBounds(284, 203, 141, 23);
		SortingWindow.getContentPane().add(btnBubble);
		
		
		//INSERTION SORT CONFIGURATION
		JButton btnInsertion = new JButton("Insertion Sort");
		btnInsertion.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			
				 int insert;

			        for (int next = 1; next < nums.length; next++) 
			        {
			            insert = nums[next];
			            int moveItem = next;

			            while (moveItem > 0 && nums[moveItem - 1] < insert) 
			            {
			                nums[moveItem] = nums[moveItem - 1];
			                moveItem--;
			            }
			            nums[moveItem] = insert;
			        }
			        
			      //Display the selection sorted list
					txtDisplay.append("The Insertion sorted list is:" + "\n");
					
					 for (int i = 0; i < nums.length; i++) 
					 {
				            txtDisplay.append(nums[i] + "\n");
					 }
			}
		});
		btnInsertion.setBounds(284, 237, 141, 23);
		SortingWindow.getContentPane().add(btnInsertion);
		
		
		//QUICK SORT CONFIGURATION
		JButton btnQuick = new JButton("Quick Sort");
		btnQuick.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent e) 
			{
				
				ASCQuickSort(nums, 0, nums.length - 1);
				
				//Loop to control number of passes
		        for (int pass = 1; pass < nums.length; pass++) 
		        {
		            //Loop to control number of comparisons for length of numsay - 1
		            for (int element = 0; element < nums.length - 1; element++) 
		            {
		                //compare side-by-side elements and swap them if
		                //first element is greater than second element
		                if (nums[element] < nums[element + 1]) 
		                {
		                    swap(nums, element, element + 1);  //call to swap method
		                }
		
		            }
		            
		        }
				
				 //Display the Quick sorted list
				txtDisplay.append("The Quick sorted list is:" + "\n");
				
				 for (int i = 0; i < nums.length; i++) 
				 {
			            txtDisplay.append(nums[i] + "\n");
			            
				 }
			}
			
			private void swap(int numsay2[], int first, int second) 
			{
				int hold = numsay2[first];
		        numsay2[first] = numsay2[second];
		        numsay2[second] = hold;
			}
			
	
		});
		btnQuick.setBounds(284, 273, 141, 23);
		SortingWindow.getContentPane().add(btnQuick);
		
		Button btnExit = new Button("Exit ");
		btnExit.setForeground(Color.BLACK);
		btnExit.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
				
			}
		});
		btnExit.setBounds(407, 380, 70, 22);
		SortingWindow.getContentPane().add(btnExit);
		
		//Reset Button Setup 
		Button btnReset = new Button("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtDisplay.setText(null);
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setBounds(267, 380, 70, 22);
		SortingWindow.getContentPane().add(btnReset);
		
		JButton btnShellSort = new JButton("Shell Sort (Asc)");
		btnShellSort.setVerticalAlignment(SwingConstants.BOTTOM);
		btnShellSort.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent e) 
			{
				
				int n = nums.length;
				
				
				// Start with a big gap, then reduce the gap size
		        for (int gap = n/2; gap > 0; gap /= 2) 
		        { 
		            // Do a gapped insertion sort for this gap size. 
		            // The first gap elements a[0..gap-1] are already 
		            // in gapped order keep adding one more element 
		            // until the entire numsay is gap sorted 
		            for (int i = gap; i < n; i += 1) 
		            { 
		                // add a[i] to the elements that have been gap 
		                // sorted save a[i] in temp and make a hole at 
		                // position i 
		                int temp = nums[i]; 
		  
		                // shift earlier gap-sorted elements up until 
		                // the correct location for a[i] is found 
		                int j; 
		                for (j = i; j >= gap && nums[j - gap] > temp; j -= gap) 
		                    nums[j] = nums[j - gap]; 
		  
		                // put temp (the original a[i]) in its correct 
		                // location 
		                nums[j] = temp; 
		            } 
		        } 
		        
		        //Display the selection sorted list
				txtDisplay.append("The Shell sorted list is:" + "\n");
				
				 for (int i = 0; i < nums.length; i++) 
				 {
			            txtDisplay.append(nums[i] + "\n");
			            
				 }
		        
		    } 
			
			
		});
		btnShellSort.setBounds(284, 308, 141, 23);
		SortingWindow.getContentPane().add(btnShellSort);
		
	}
	
	//Quick sorting algortithm
	public static void ASCQuickSort(int nums[], int low, int high) 
    {
        int partitionLoc;
        if (low < high) {
            partitionLoc = partition(nums, low, high);
            ASCQuickSort(nums, low, partitionLoc - 1);
            ASCQuickSort(nums, partitionLoc + 1, high);
        }
    }
	
    public static int partition(int nums2[], int left, int right) {
        boolean moveLeft = true;
        int separator = nums2[left];

        while (left < right) {
            if (moveLeft == true) {
                while ((nums2[right] >= separator) && (left < right)) {
                    right--;
                }
                nums2[left] = nums2[right];
                moveLeft = false;
            } else {
                while ((nums2[left] <= separator) && (left < right)) {
                    left++;
                }
                nums2[right] = nums2[left];
                moveLeft = true;
            }
        }
        nums2[left] = separator;
        return left;
    }
}

