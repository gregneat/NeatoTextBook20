#include <iostream.h>
#include <fstream.h>

// This program reads the contents of the file text.txt
// and writes them to the screen, char by char.

main()
{
	ifstream greg;
	char neat;
	greg.open("text.txt", ios::in);

	while(greg >> neat)
	{
		cout << neat;
	}

}