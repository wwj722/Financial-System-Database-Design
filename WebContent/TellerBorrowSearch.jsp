!X��0��$: �נ�y���k�.4���D/6�y�`�s9ц�ͫ��ɪ�ћ
���tPm���_��n�/�O�0)y��E�T�4�Y0ڎxI0O�'�(�$��͋����*��U�chݛg���g>���w2�F#��n6��'�U����Ak��!���	d�̀��J-�G�~#�d��Ѧ~��a�V	_u�����䴆>Aq7c�,^�)(o�O3m4�Z61��0_Χӫ�d��蚜C��=���b�S�Y_�j\��1
hL�O�&��m�ORIo�g-��"<݀���o�H	競�l)K7���}, �kw��n�<���:�dXCD���+@��񹓿���0إ�6&�͐
}6��D�_�Ĝ.�r���3�)�g�<kGz���}��aX`�[-Bd@$�����\�b��G!tVi�Ǒ�m��Y�����-V:X�
��Y���o��k���U��,ִ�	㓥Fk��������,�"�P	�J��x>Ō��t�G�,y2*N�c���_��O�t�"�NL2\���Ɗp�g�'����(�~���b���'i�8#�P�:ݣ��������	\�Ǵπ�#?�����Y����;�t��#��
��~�~�|
��m
��B������8������ф��T��͉/��FU��K�C��{M��
12i��� \��}�d�_qϻ����4��(�,5ZoGFО?9�I�_���\lH�-̤����Vo�����c;�}?�ܢ�1Ȫ2{��sw�?SP��E��˽p�4( �=@��n)滀�LKfd'Q~���!eH����4n�o9;���1��IS�=����44I*�mZ�-܂+rC}B� �^xW��AB�U��3���4u��o�E�������X4��h�3�=��Bz�,X����c�B�rw��V��ʱ���|�V ��������������ɽ������������Q*Ga�Si�m�R��Ă�S�S4���Yqwv�q��S��W�{)��3*�H	�5 �=�-44�*b���WD�mNQǸU�
{��9$6���\_�(G aR�9�$Q��v��D�[(��@�G@�F�G���h(�x��y+Æ�"#��04
�!z�(�F��8_�?�`xU1�)��	���(�qtK�P_:���(W ���%��X7}6���i�āP<���a��()��������u���!Nw���Z��k|'�p�}�U�I���
d��M�TH��	�6�k������,q%p��� ���'ȅD�Bk�����}*>�o�������U_q�x�	f����N�e^L�p"�� ��D�I�TY@���'�q���\T�#�	g�1$�N��bm����o��FMW�`.wY��s�F7��}~�|#�6|y����Xt H��U ���Y���%�G�)q� gpl�KL%�t'�ᡠA�9Xl쯪�����5-Dp�C�IM��$�GM洞��s� ��"���pP�µ�ype="hidden" value="${category}" name="category" /> <input
				type="hidden" value="${keyword}" name="keyword" /> <input
				type="hidden" value="${department}" name="department" /> <input
				type="hidden" value="${end}" name="end" /> <input type="hidden"
				value="${start}" name="start" />
			<table id="app_table">
				<thead>
					<td>id</td>
					<td>name</td>
					<td>amount</td>
					<td>Department</td>
					<td>deadline</td>
					<td>recorder</td>
					<td>Interest rate</td>
				</thead>
				<tbody>
					<c:forEach items="${tellList}" var="app">
						<tr>
							<td><label><input type="checkbox" value="${app.id}"
									name="app_id" />${app.id}</label></td>
							<td>${app.name}</td>
							<td>${app.amount}</td>
							<td>${app.department}</td>
							<td>${app.deadline} </td>
							<td>${app.recorder.name} </td>
							<td>${app.interestRate} </td>
							

						</tr>
					</c:forEach>
				</tbody>

			</table>
			<input type="button" value="Delete" onclick="fm1()" /> 
			<input type="reset" name="Reset" /> 
			<input type="button" value="Update" onclick="fm2()"/> 
			
		</form>
	</center>
</body>
</html>