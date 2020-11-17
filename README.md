
Author : Sushovan Karmakar (16.09.2020)

Steps :
1. First we created three main classes i.e Team, Part and Car which are mainly the backbone of the data which are present in the csv files.
2. We read the csv files from command line and store them in the list or map format accoding to our requirement.
3. We pass those lists and maps to the calculator class to calculate the winner.
4. 
	a. To calculate the winner, we take each team and and associated cars with it.
	b. We take each car and take the list of associated parts of it.
	c. We take the list of parts of a particular car and sort them in the basis of speed boost per price.
	b. Now we through the sorted list of parts and add those parts until we have funds or boosted speed less or equals to top speed.
	c. After calculation, the details like, final boosted speed, total fund spent for speed boosting and the team name are added to that car.
	d. At the end, we sort the car list on the basis of highes boosted speed achieved and return the winning car.

5. We print the details of the winning car in the main class.

Thank you.