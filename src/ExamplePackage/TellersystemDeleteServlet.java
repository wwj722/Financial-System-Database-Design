Z2�\�*w�f�"���:��6��h	� � �0�
W����84���zW`��Z���d��~>�i��9�0��T��˄H9"�:� a��}�&p*��7Nƃk[Pf�u r�A,p��9� ��f@v�TX 3�w���_D�b7�F F�@6C��P��3��"���+v���iOv=
b�����j���`+@6;"��lY�,��������&��b}MeT���4���d$o�7��N�ԡ�$k�:o�ss�&�5jj
�<�O$��e.tL�D�Ӵv��R���l������)aq�S�^��Q��U��'W���M��K�R+҅ɴ�/i������q�h])�cp~��8���o��9M�}�ms_�2��pN^D�����=�;N���Д��s���q�\N�E�o�a����7���{���vi4t�Z�UK��1������YUw���1xi�@�GQE�Yx)�ڦ���$X�D]BK��ȸ��������:�~M��8<=O��PJ��8��Ke�$%���E�$�Q���i�s�T�&K������xar�ȥ�\�O3�9�ĵ���	��x�u��[.m������ib��?�8��_#$���'	3S���_f\{?�W��W��m9n(�����ˠ(q��5̅|p_��Q�a�-�;���C�[��!�����֨D����r}\�U��9$	hd��f����s��I���@��y�+�*
�W@�0�H����݄��������m'-��G��"��2� kq�}�/Y9S���ԁtx�����C��B	���.�l��Xq[�˂�`*��y�l[���l��s�h�W���J����Ý{�� ��B$�ag��O/�����&G|������>
NGu�~'���D��G���,�_
DS�5�G��S����^Y׀3ɟۉ3�k����y[����v� ���dȑ{�V,�Y�(74tM�	��*E<�~����s�LD���BA�vG����/�r�{*��6I_�z�Dyy�Z��*�Z�oiE�����I۴7��Z�V��]Ѥ0�A�~a��b����{3�9�;:�[�X�=�]On>�xn��Us���'���'�y�_��#�5D�$�pN����0����X�m�CƬ���țgӸ�9�A���6�k�9!����1�C��v<x/A��ǝ�`��,H��#�9���k�'V�I����>���VФv}R��Fy����G�k>5����M�A�K�(^�}o>lyE���Yχ�t{��	�%cp���N�-q�"����������#A�yUcĹ(۷t�A�#�&-�]�`�#�ћ��ɿ%�.�dX�d���R�%w�d��ڳ�G���5'���I�� +*�QI+�b��#�I2��o�8�-8���Hn���Eq.�|}���@͆o%_*��nA����B�ߖ�^�q)��e�)=�����z��&���p$�%&֙��K:y=����yuR���K|���$i�>�_d�n();
		conn.DeleteTeller(id, category);
	
		try {
			
			if(category.equals("salary")){
			
			List<Salary >x = conn.ViewSalary(start, end, department, keyword);
			request.setAttribute("tellList", x);
			request.getRequestDispatcher("TellerSalarySearch.jsp").forward(request, response);
			}
			
			else if(category.equals("OtherExpenditure")){
				
				List<OtherExpenditure>x = conn.ViewOtherExpenditure(start, end, department, keyword);
				request.setAttribute("tellList", x);
				request.getRequestDispatcher("TellerOtherExSearch.jsp").forward(request, response);
				
				}
				
			else if(category.equals("OtherIncome")){
				
				List<OtherIncome>x = conn.ViewOtherIncome(start, end, department, keyword);
				request.setAttribute("tellList", x);
				request.getRequestDispatcher("TellerOtherInsearch.jsp").forward(request, response);
				}
				
			else if(category.equals("BorrowMoney")){
				
				List<BorrowMoney >x = conn.ViewBorrowMoney(start, end, department, keyword);
				request.setAttribute("tellList", x);
				request.getRequestDispatcher("TellerBorrowSearch.jsp").forward(request, response);
				}
		
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
