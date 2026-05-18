from unittest import TestCase
import trial 

class  Testtrial(TestCase):
    def test_that_two_and_one_sum_up_to_three(self):
        first_number = 1
        second_number = 2
        expected = 3
        actual = trial.get_sum(first_number, second_number)
        self.assertEqual(actual, expected)
        
        
    def test_get_sum_of_numbers(self):
        numbers = [1,2,3,4,5]
        expected = 15
        actual = trial.get_sum_of_numbers(numbers)
        self.assertEqual(actual, expected)
         
    def test_that_first_number_in_an_array_is_the_lowest(self):
        numbers = [11,2,-1,40,5]
        expected = -1
        result_gotten = trial.sorted_numbers(numbers)
        actual = result_gotten[0]
        self.assertEqual(actual, expected)
        
        
        
    def test_that_get_lowest(self):
        numbers = [11,2,-1,40,5]
        expected = -1
        actual = trial.get_smallest(numbers)
        self.assertEqual(actual, expected)
        
    def test_that_first_number_in_an_array_is_the_lowest(self):
        numbers = [11,2,-1,40,5]
        expected = -1
        result_gotten = trial.sorted_numbers(numbers)
        print(result_gotten)
        actual = result_gotten[0]
        last_number = result_gotten[len(result_gotten) - 1]
        self.assertEqual(actual, expected)
        self.assertEqual(40, last_number)
        
    def test_that_get_biggest(self):
        numbers = [11,2,-1,40,5]
        actual = trial.get_biggest(numbers)
        self.assertTrue(actual == 40)
        self.assertTrue(actual != 2)
        



    def test_sort_in_ascending(self):
        numbers = [11,2,-1,40,5]
        expected = 40
        result_gotten = trial.sorted_numbers_descending(numbers)
        print(result_gotten)
        actual = result_gotten[0]
        last_number = result_gotten[len(result_gotten) - 1]
        self.assertEqual(actual, expected)
        self.assertEqual(-1, last_number)
