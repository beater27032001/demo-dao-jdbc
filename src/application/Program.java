package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: Seller findById ===");
		Seller sel = sellerDao.findById(3);
		System.out.println(sel);

		System.out.println("=== TEST 2: Seller findDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.finByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
