package interview.zauba;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		chmod solver = new chmod();
		solver.solve(in, out);
		out.close();
	}
}
 
class chmod
{
	public void solve (InputReader in, OutputWriter out)
	{
		int [] primes = {2,3,5,7};
		int n = in.readInt();
		int [][] exponents = new int [n + 1][4];
		int i = 1;
		while (i <= n)
		{
			int element = in.readInt();
			
			for (int j = 0; j < 4; j++)
				exponents[i][j] = exponents[i - 1][j];
			
			int j = 0;
			while (element > 1)
			{
				int div = primes[j], c = 0;
				while (element % div == 0)
				{
					element /= div;
					c++;
				}
				exponents[i][j] += c;
				j++;
			}
			i++;
		}
		
		for (int t = in.readInt(); t-- > 0; )
		{
			int l = in.readInt() - 1, r = in.readInt(), m = in.readInt();
			long result = 1;
			for (i = 0; i < 4; i++)
			{
				int exponent = exponents[r][i] - exponents[l][i];
				if (exponent > 0)
				{
					long base = primes[i];
					while (exponent > 0)
					{
						if (exponent % 2 == 1)
							result = (result * base) % m;
						exponent = exponent >> 1;
						base = (base * base) % m;  
					}
				}
			}
			out.printLine(result % m);
		}
	}
}
 
class InputReader {
	 
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;
 
	public InputReader(InputStream stream) {
		this.stream = stream;
	}
 
	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
 
	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
 
	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuffer res = new StringBuffer();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}
 
	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
 
	public String next() {
		return readString();
	}
 
	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
 
class OutputWriter {
	private final PrintWriter writer;
 
	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}
 
	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}
 
	public void print(Object...objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}
 
	public void printLine(Object...objects) {
		print(objects);
		writer.println();
	}
 
	public void close() {
		writer.close();
	}
 
	}  
 