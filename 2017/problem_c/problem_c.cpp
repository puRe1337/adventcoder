#include <iostream>
#include <string>
#include <vector>
#include <sstream>

template <class Container>
void split2(const std::string& str, Container& cont, char delim = ' ')
{
	std::stringstream ss(str);
	std::string token;
	while (std::getline(ss, token, delim)) {
		cont.push_back(std::stoi(token));
	}
}

int main() {
	std::string current_line;
	std::vector<std::string> candles;
	while(1) {
		std::getline(std::cin, current_line);
		if (current_line.compare("end") == 0)
			break;
		candles.push_back(current_line);
	}

	for(auto candle : candles) {
		std::vector<int> candle_int;
		split2(candle, candle_int);
		int value = 0;
		for (auto ii : candle_int)
			value += ii;
		printf("%d\n", value);
	}

	return 1;
}