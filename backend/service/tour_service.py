import re

import dao.tour_dao
from exception.tour_error import TourError
from dao.tour_dao import TourDao
from util.helpers import validate_tour

class TourService:
    def __init__(self):
        self.tour_dao = TourDao()

    def add_poi(self, pois):
        if len(pois) < 3:
            raise TourError(f"Pick more than 3 points of interest")

        if len(pois) > 5:
            raise TourError(f"Cannot pick more than 5 points of interest")
        return self.tour_dao.add_poi(pois)

    def add_tour(self, tour):
        return self.tour_dao.add_tour(tour).to_dict()

    def view_tours(self):
        return self.tour_dao.get_tour()

    def view_tours_by_id(self, user_id):
        return self.tour_dao.get_tours_by_id(user_id)

    def update_tours(self, tour):
        updated_tour = None
        if validate_tour(tour):
            updated_tour = self.tour_dao.update_tour(tour)
        return updated_tour

    def delete_tour(self, tour_id):
        return self.tour_dao.delete_tour(tour_id)