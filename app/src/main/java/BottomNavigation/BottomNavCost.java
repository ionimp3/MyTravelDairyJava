package BottomNavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lmh.mytraveldairyjava.R;

import Common.MessageToast;
import ViewrModelAdapters.CostAdapter;

public class BottomNavCost extends Fragment {
    public BottomNavCost() {
        // 빈공간필요
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_nav_cost,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.cost_rv_view);
        CostAdapter costAdapter = new CostAdapter();
        recyclerView.setAdapter(costAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return  view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.actionbarcustum,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int  id = item.getItemId();
        if (id == R.id.curr_changed) {
            MessageToast.message(getActivity(), "프래그먼트레이아웃에서 툴바 실행버튼사용");
        }
        if (id == android.R.id.home) {
            MessageToast.message(getActivity(), "프래그먼트레이아웃에서 툴바 뒤로가기버튼사용");
        }
        return super.onOptionsItemSelected(item);
    }
}

