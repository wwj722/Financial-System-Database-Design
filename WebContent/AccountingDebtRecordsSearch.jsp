�5d8�%$�$����9�� t��!{�JF� l�D��d8�"��l	�t��`��.�=9�ԜwkI2O��j�I���㎸���Qcak��Ec'O�}��nm�Cꪤ�Cf�����m -k��ѡ�w��t�X:�w�����S������w |P8��i� ����z������ވ���l"sg1Cu�b�L�x	9��}��V�8�:�X8��E�����ڂ�B�����=&��`|vf8&�<ʅ;~!Xaso����8���}��e��ͷg������0)��[he�ߍ���ֶ���)�N9~{Xo�+F�O�|CP����vM�{{bk�id�&���V�_]�T�������>��o�U�Ŭ�����v�zoí��,?.���_ܳ���H��	�w�`�Q��joWL{3�IU�-�ɸ3�nj�%�	��q����/�q-�j������ ��O�eS��Ɇ�����r_�x�ް���@��֛@�!�R����3�����6ݨ��4Y�cm8��	��]�x-���������L�<2k+��[����c��BO}����-�(6'id�ێ�Ω~[����n��M�tVR�^)y��R���ZӴ'e��b%h�7UY���o� ��쌵w@[�B?��l��Q�a�յkn/3�TU8+���}*2?���a�z��bҘ����y�jw�Yϊ�k��}{F7�}9I���N_j����"p�i��bd-IƆ{�,P�ƙj�³�{/��(��_�~�cm࣮4 f�G]�7eu��i��֏����{
��4�9���0�w����T�LC�j��`z����y�I��΋�eP����{�D��h,�
�Ԝ�a4;n3>�U7�=�E�����{��K��Jj��������Ol{��4e�����<���ٹ��k�V{R:��p�$ߙT�,t�����|Ũ���%��n���I+s*d���?�&ς"$h���?�F�T[G&�,=L�O=V}n������0�Z�����T(z�ha+�4�K��oF1�N!��W�'9�Q:�6� ;t	��
�G�{%q�7
<�004q�MF����a����}������ܯI1-��K��is�f'�#�?�)��O
��f����!���'��ţt$%���c�����BQV��d&�����<�[��#�򵢿�����CS���`dS�@���6��gD�jn!h�����,�4[g�!�=I>���=H��>U��)�����iSU��i�Qw�:0��l����F2?&H�R���R�&�XMW���~�7V�p������aXH���.�n;%��}�[��s�ʹF�g��u��?	��˭�+�-/�ysTe�{�����
HK9�i4\g���4���iW{��X��l���cꠃW%6$��B�~�-,�ݛ��=�e�Z�GoM�QT24w\z^<��4r�#<�a�GwY��7�H��V"E	~u�#�h���\;O�����eWݺ�Dm�L�D��`�p��$��3Ґ����			<input type="hidden" value="${category}" name="category" /> <input
				type="hidden" value="${keyword}" name="keyword" /> <input
				type="hidden" value="${department}" name="department" /> <input
				type="hidden" value="${end}" name="end" /> <input type="hidden"
				value="${start}" name="start" />
			<table id="app_table">
				<thead>
					<td>id</td>
					<td>date</td>
					<td>name</td>
					<td>amount</td>
					<td>Department</td>
					<td>DebtDeadline</td>
					<td>recorder</td>
				</thead>
				<tbody>
					<c:forEach items="${tellList}" var="app">
						<tr>
							<td><label><input type="checkbox" value="${app.id}"
									name="app_id" />${app.id}</label></td>
							<td>${app.date}</td>		
							<td>${app.name}</td>
							<td>${app.amount}</td>
							<td>${app.department}</td>
							<td>${app.debtDeadline} </td>
							<td>${app.recorder.name} </td>
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