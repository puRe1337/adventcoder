#include <iostream>
#include <string>
#include <vector>

int main() {
	char days[7][30] = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"}; 
	std::vector<std::string> inputs;
	std::string current_line;
	do{
		std::getline(std::cin, current_line);
		inputs.push_back(current_line);
	}
	while(current_line.compare("end") != 0);
	for(int i = 0; i < inputs.size(); i++) {
		int day = 0;
		char text[128];
		if ( sscanf( inputs[i].c_str( ), "%s %d", &text, &day ) != 2 )
			return 0;
		day -= 1;
		std::cout << days[ day % 7] << std::endl;
	}
	return 1;
}
