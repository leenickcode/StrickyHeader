package com.nick.strickyheader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ArrayList<String> data;
    MainAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=findViewById(R.id.rv);
         adapter=new MainAdapter(this);
         initDatas();
         adapter.setData(data);
        mRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(this);
        layoutmanager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutmanager);
        SectionDecoration.GroupInfoCallback callback = new SectionDecoration.GroupInfoCallback() {
            @Override
            public GroupInfo getGroupInfo(int position) {

                /**
                 * 分组逻辑，这里为了测试每5个数据为一组。大家可以在实际开发中
                 * 替换为真正的需求逻辑
                 */
                int groupId = position / 5;
                int index = position % 5;
                GroupInfo groupInfo = new GroupInfo(groupId,groupId+"");
                groupInfo.setPosition(index);
                return groupInfo;
            }
        };
        mRecyclerView.addItemDecoration(new SectionDecoration(this,callback));

    }

    /**初始化测试数据*/
    private void initDatas() {
        data = new ArrayList<>();
        for (int i = 0; i < 56;i++) {
            data.add(i+" test ");
        }
    }

}
