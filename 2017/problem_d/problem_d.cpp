#include <iostream>
#include <map>
#include <string>


int main() {
	std::map<std::string, int> snow_incr;
	snow_incr["heavy snowing"] = 10;
	snow_incr["snowing"] = 5;
	snow_incr["light rain"] = -3;
	snow_incr["heavy rain"] = -8;
	snow_incr["cloudy"] = 0;
	snow_incr["sunshine"] = -1;
	int snow_height = 0;
	std::string current_line;
	while(1) {
		std::getline(std::cin, current_line);
		if (current_line.compare("end") == 0)
			break;
		if (snow_incr.find(current_line) == snow_incr.end())
			return 1;
		snow_height += snow_incr[current_line];
		std::cout << snow_height << std::endl;
	}
	return 1;
}